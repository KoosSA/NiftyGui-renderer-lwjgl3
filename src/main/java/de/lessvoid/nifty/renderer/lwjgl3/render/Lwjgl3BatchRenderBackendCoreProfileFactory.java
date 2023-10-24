package de.lessvoid.nifty.renderer.lwjgl3.render;

import javax.annotation.Nonnull;

import de.lessvoid.nifty.render.batch.core.BatchRenderBackendCoreProfileInternal;
import de.lessvoid.nifty.render.batch.spi.BatchRenderBackend;

/**
 * @author Aaron Mahan &lt;aaron@forerunnergames.com&gt;
 */
public class Lwjgl3BatchRenderBackendCoreProfileFactory {
    
  @Nonnull
  public static BatchRenderBackend create(final long glfwWindow) {
    return new BatchRenderBackendCoreProfileInternal(
            new Lwjgl3CoreGL(),
            new Lwjgl3BufferFactory(),
            new Lwjgl3ImageFactory(),
            new Lwjgl3MouseCursorFactory(glfwWindow));
  }
}


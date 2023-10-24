package de.lessvoid.nifty.renderer.lwjgl3.render;

import java.nio.ByteBuffer;

import de.lessvoid.nifty.render.batch.spi.BatchRenderBackend;

/**
 * @author Aaron Mahan &lt;aaron@forerunnergames.com&gt;
 */
public class Lwjgl3Image extends BatchRenderBackend.ByteBufferedImage {
  public Lwjgl3Image(ByteBuffer buffer, int width, int height) {
    super(buffer, width, height);
  }
}

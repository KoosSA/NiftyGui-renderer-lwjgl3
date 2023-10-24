package de.lessvoid.nifty.renderer.lwjgl3.render;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.annotation.Nonnull;

import org.lwjgl.BufferUtils;

import de.lessvoid.nifty.render.batch.spi.BufferFactory;

/**
 * @author Aaron Mahan &lt;aaron@forerunnergames.com&gt;
 */
public class Lwjgl3BufferFactory implements BufferFactory {
  @Nonnull
  @Override
  public ByteBuffer createNativeOrderedByteBuffer(final int numBytes) {
    return BufferUtils.createByteBuffer(numBytes);
  }

  @Nonnull
  @Override
  public FloatBuffer createNativeOrderedFloatBuffer(final int numFloats) {
    return BufferUtils.createFloatBuffer(numFloats);
  }

  @Nonnull
  @Override
  public IntBuffer createNativeOrderedIntBuffer(final int numInts) {
    return BufferUtils.createIntBuffer(numInts);
  }
}

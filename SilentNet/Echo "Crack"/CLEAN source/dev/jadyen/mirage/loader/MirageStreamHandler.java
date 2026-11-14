package dev.jadyen.mirage.loader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class MirageStreamHandler extends URLStreamHandler {
   private final byte[] bytes;

   public MirageStreamHandler(byte[] bytes) {
      this.bytes = bytes;
   }

   @Override
   protected URLConnection openConnection(URL u) {
      return new URLConnection(u) {
         @Override
         public void connect() {
         }

         @Override
         public InputStream getInputStream() {
            return new ByteArrayInputStream(MirageStreamHandler.this.bytes);
         }
      };
   }
}

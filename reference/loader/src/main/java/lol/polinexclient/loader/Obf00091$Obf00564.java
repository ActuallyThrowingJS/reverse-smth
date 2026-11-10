// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

public interface Obf00091$Obf00564
   extends Library {
   int Obf00099(int var1, boolean var2, boolean var3, IntByReference var4);

   int Obf00099(
      int var1, int var2, int var3, Pointer var4, int var5, IntByReference var6
   );
}

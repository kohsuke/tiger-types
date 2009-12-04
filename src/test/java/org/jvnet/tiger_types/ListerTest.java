package org.jvnet.tiger_types;

import junit.framework.TestCase;

import java.net.Proxy.Type;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author Kohsuke Kawaguchi
 */
public class ListerTest extends TestCase {

    public EnumSet<Type> set;

    public void testEnumSet() throws Exception {
        Lister l = Lister.create(getClass().getDeclaredField("set").getGenericType());
        l.add(Type.HTTP);
        l.add(Type.SOCKS);
        Set col = (Set)l.toCollection();
        assertTrue(col instanceof EnumSet);
        assertTrue(col.contains(Type.HTTP));
    }
}

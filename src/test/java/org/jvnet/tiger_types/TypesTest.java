package org.jvnet.tiger_types;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author Kohsuke Kawaguchi
 */
public class TypesTest {
    @Test
    public void bind() throws Exception {
        Type arrayListOfString = Types.getBaseClass(Sub.class, ArrayList.class);

        // add(E e)
        Method m = ArrayList.class.getMethod("add", Object.class);

        // E resolves to String in ArrayList<String>
        Type r = Types.bind(m.getGenericParameterTypes()[0], ArrayList.class, (ParameterizedType) arrayListOfString);

        assertEquals(String.class,r);
    }

    class Sub extends ArrayList<String> {}
}

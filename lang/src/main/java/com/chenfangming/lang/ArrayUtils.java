package com.chenfangming.lang;

import java.lang.reflect.Array;

/**
 * Array工具类.
 * @author 陈方明  cfmmail@sina.com
 * @since 2019-01-04 23:28
 */
public final class ArrayUtils {
    /** 一个空的不可变{@code Object}数组。 **/
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    /** 一个空的不可变{@code Class}数组。 **/
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    /** 一个空的不可变{@code String}数组。 **/
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    /** 一个空的不可变{@code long}数组。 **/
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    /** 一个空的不可变{@code Long}数组。 **/
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    /** 一个空的不可变{@code int}数组。 **/
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    /** 一个空的不可变{@code Integer}数组。 **/
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    /** 一个空的不可变{@code short}数组。 **/
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    /** 一个空的不可变{@code Short}数组。 **/
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    /** 一个空的不可变{@code byte}数组。 **/
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    /** 一个空的不可变{@code Byte}数组。 **/
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    /** 一个空的不可变{@code double}数组。 **/
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    /** 一个空的不可变{@code Double}数组。 **/
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    /** 一个空的不可变{@code float}数组。 **/
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    /** 一个空的不可变{@code Float}数组。 **/
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    /** 一个空的不可变{@code boolean}数组。 **/
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    /** 一个空的不可变{@code Boolean}数组。 **/
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    /** 一个空的不可变{@code char}数组。 **/
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    /** 一个空的不可变{@code Character}数组。 **/
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];
    /**
     * 在List或Array中找不到元素时的索引值: {@code -1}。
     * 此值由此类中的方法返回，
     * 也可用于与{@link java.util.List}中的各种方法返回的值进行比较。
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * 工具类隐藏public构造器。
     */
    private ArrayUtils() {
        super();
    }


    /**
     * 返回要检查的数组的长度。
     * @param array 要检查的数组
     * @return 数组的长度，如果数组为{@code null}，则为{@code 0}
     * @throws IllegalArgumentException 如果object参数不是数组
     */
    public static int length(final Object array) throws IllegalArgumentException {
        return null == array ? 0 : Array.getLength(array);
    }


    /**
     * 检查一个数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Object... array) {
        return null == array || 0 == array.length;
    }

    /**
     * 检查一个原始long数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final long[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Long数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Long[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个原始int数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final int[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Integer数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Integer[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个原始short数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final short[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Short数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Short[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个原始char数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final char[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Character数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Character[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个原始byte数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final byte[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Byte数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Byte[] array) {
        return 0 == length(array);
    }


    /**
     * 检查一个原始double数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final double[] array) {
        return length(array) == 0;
    }

    /**
     * 检查一个包装类Double数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Double[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个原始float数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final float[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Float数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Float[] array) {
        return 0 == length(array);
    }


    /**
     * 检查一个原始boolean数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final boolean[] array) {
        return 0 == length(array);
    }

    /**
     * 检查一个包装类Boolean数组是否为空或{@code null}。
     * @param array 要检查的数组
     * @return {@code true} 如果数组为空或{@code null}
     */
    public static boolean isEmpty(final Boolean[] array) {
        return 0 == length(array);
    }

    /**
     * 参数array是否不为空.
     * 1. 如果参数array为{@code null}返回{@code false}
     * 2. 如果参数array的长度为{@code 0}返回{@code false}
     * @param <T> 参数array的元素类型
     * @param array 参数array
     * @return boolean 参数array是否不为空
     */
    public static <T> boolean isNotEmpty(final T... array) {
        return !isEmpty(array);
    }

}

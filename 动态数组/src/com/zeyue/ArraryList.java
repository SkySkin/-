package com.zeyue;

/**
 * @author zeyue
 * @createDate 2020/06/07 18:49
 * @see com.zeyue
 * 用来模拟动态数组
 * 需要有的方法
 * <p>
 * int size(); //元素的数量
 * boolean isEmpty //是否为空
 * boolean contains(E element) // 是否包含某个元素
 * void add(E element) //把元素添加到最后
 * E get(int index) // 根据索引得到某个元素
 * E set(int index,E element) //根据下标设置某个元素
 * void add(int index,E element) //根据下标添加某个元素
 * E remove(int index) //根据下标移除某个元素
 * int indexOf(E element) //查看元素位置
 * void clear(); //清除所以元素
 */
public class ArraryList<E> {
    /**
     * 元素的数量
     */
    public int size() {
        return 0;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return false;
    }

    /**
     * 把元素添加到最public E get(int index) // 根据索引得到某个元素
     * @param element
     */
    public void add(E element) {

    }

    /**
     * 根据下标设置某个元素
     * @param index
     * @param element
     * @return
     */
    public E set(int index, E element) {
        return null;
    }

    /**
     * 根据下标添加某个元素
     * @param index
     * @param element
     */
    public void add(int index, E element) {

    }

    /**
     * 根据下标移除某个元素
     * @param index
     * @return
     */
    public E remove(int index) {
        return null;
    }

    /**
     * 查看元素位置
     * @param element
     * @return
     */
    public int indexOf(E element) {
        return 0;
    }

    /**
     * 清除所以元素
     */
    public void clear() {

    }


}

 JavaHomeWork11
集合框架
===============
任务与整体解决方案：
------
* 分别用TreeSet、HashSet、ArrayList、TreeMap和HashMap类存储第4章例4-4的矩形。可以给定点信息查找相应矩形，并能将存储的矩形信息全部显示出来。

### 分别用TreeSet、HashSet、ArrayList、TreeMap和HashMap类存储第4章例4-4的矩形。可以给定点信息查找相应矩形，并能将存储的矩形信息全部显示出来。

把例4-4的抄过来，然后分别使用这几种数据结构存储即可。

领悟：
------
### 集合框架的分类
Java 集合框架主要包括两种类型的容器，一种是集合（Collection），存储一个元素集合，类似数组；另一种是图（Map），存储键/值对映射，类似字典。常用的有 ArrayList、LinkedList、HashSet、LinkedHashSet、HashMap、LinkedHashMap 等等

### 关于迭代器
 一般遍历数组都是采用for循环或者增强for，这两个方法也可以用在集合框架，但是还有一种方法是采用迭代器遍历集合框架，它是一个对象，实现了Iterator 接口或ListIterator接口。<br>
迭代器，使你能够通过循环来得到或删除集合的元素。ListIterator 继承了Iterator，以允许双向遍历列表和修改元素。如：
```
Iterator<String> ite=list.iterator();
while(ite.hasNext())//判断下一个元素之后有值
{
    System.out.println(ite.next());
}
```
以及：
```
Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
Map.Entry<String, String> entry = it.next();
System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
}
```
还是比较简单的....剩下就没啥了。<br>
至此，2019年上半学期的Java课程学习到此结束。以后用的上用不上再说，但不得不说这是门迷人的语言。而且也借此学会了git和写README等<br>
谢谢大家，祝一直在github上支持我的大家考试成功

<br>*Signed-off-by: 遥梦幽兰kzx <kjx336@163.com>*
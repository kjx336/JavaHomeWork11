 JavaHomeWork11
���Ͽ��
===============
������������������
------
* �ֱ���TreeSet��HashSet��ArrayList��TreeMap��HashMap��洢��4����4-4�ľ��Ρ����Ը�������Ϣ������Ӧ���Σ����ܽ��洢�ľ�����Ϣȫ����ʾ������

### �ֱ���TreeSet��HashSet��ArrayList��TreeMap��HashMap��洢��4����4-4�ľ��Ρ����Ը�������Ϣ������Ӧ���Σ����ܽ��洢�ľ�����Ϣȫ����ʾ������

����4-4�ĳ�������Ȼ��ֱ�ʹ���⼸�����ݽṹ�洢���ɡ�

����
------
### ���Ͽ�ܵķ���
Java ���Ͽ����Ҫ�����������͵�������һ���Ǽ��ϣ�Collection�����洢һ��Ԫ�ؼ��ϣ��������飻��һ����ͼ��Map�����洢��/ֵ��ӳ�䣬�����ֵ䡣���õ��� ArrayList��LinkedList��HashSet��LinkedHashSet��HashMap��LinkedHashMap �ȵ�

### ���ڵ�����
 һ��������鶼�ǲ���forѭ��������ǿfor������������Ҳ�������ڼ��Ͽ�ܣ����ǻ���һ�ַ����ǲ��õ������������Ͽ�ܣ�����һ������ʵ����Iterator �ӿڻ�ListIterator�ӿڡ�<br>
��������ʹ���ܹ�ͨ��ѭ�����õ���ɾ�����ϵ�Ԫ�ء�ListIterator �̳���Iterator��������˫������б���޸�Ԫ�ء��磺
```
Iterator<String> ite=list.iterator();
while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
{
    System.out.println(ite.next());
}
```
�Լ���
```
Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
Map.Entry<String, String> entry = it.next();
System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
}
```
���ǱȽϼ򵥵�....ʣ�¾�ûɶ�ˡ�<br>
���ˣ�2019���ϰ�ѧ�ڵ�Java�γ�ѧϰ���˽������Ժ��õ����ò�����˵�������ò�˵���������˵����ԡ�����Ҳ���ѧ����git��дREADME��<br>
лл��ң�ףһֱ��github��֧���ҵĴ�ҿ��Գɹ�

<br>*Signed-off-by: ң������kzx <kjx336@163.com>*
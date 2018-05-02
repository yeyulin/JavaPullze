package ten;
/**
 * 当你在操作很大的数字时，千万要提防溢出
 * Java 不具有目标确定类型的特性，这是一种语言特性，其含义是指存储结果的变量的类型会影响到计算所使用的类型。
 * 所有乘在一起的元素 是int 那结果是int 而int 数值过大 内存会溢出
 * */
public class Three {
	public static void main(String args[]){
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		}
}

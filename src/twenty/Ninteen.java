package twenty;
/**
 * ��ע�Ͳ��ܿɿ���ע�͵�����Σ�Ӧ���õ��е�ע������������
 * **/
public class Ninteen {
	public static void main(String[] args) {
		System.err.println(classify('n')+classify('+')+classify('2'));
	}

	private static String classify(char c) {
		if("0123456789".indexOf(c)>=0) {
			return "NUMERAL ";
		}
		if("abcdefghijklmnopqrstuvwxyz".indexOf(c) >= 0) {
			return  "LETTER ";
		}
		// (Operators not supported yet)
			if ("+-*/&|!=".indexOf(c) >= 0)
					return "OPERATOR ";
		return "UNKNOWN";
	}
}

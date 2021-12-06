package algol;

import java.util.Arrays;
import java.util.Scanner;

public class naturalorder {  // 말 그대로 사람 시점에서 자연스러운 정렬을 나타내기 위한 정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Java에서 사용하는 키워드입니다.
		String[] x = {
			"abstract",   "assert",       "boolean",   "break",      "byte",
			"case",       "catch",        "char",      "class",      "const",
			"continue",   "default",      "do",        "double",     "else",
			"enum",       "extends",      "final",     "finally",    "float",
			"for",        "goto",         "if",        "implements", "import",
			"instanceof", "int",          "interface", "long",       "native",
			"new",        "package",      "private",   "protected",  "public",
			"return",     "short",        "static",    "strictfp",   "super",
			"switch",     "synchronized", "this",      "throw",      "throws",
			"transient",  "try",          "void",      "volatile",   "while"
		};

		System.out.print("원하는 키워드를 입력하세요 : ");	
		String ky = sc.next();						// 키워드를 입력 

		int idx = Arrays.binarySearch(x, ky);		// 배열 x에서 값이 ky인 요소를 검색을 진행하겠다.

		if (idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
	}
}

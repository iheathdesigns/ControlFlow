import java.util.ArrayList;
import java.util.List;

public class AsciiChars {
			
		
public static void main(String[] args) {
		
		char a = 'a';
		char b = 'b';
		char c = 'c';
		char d = 'd';
		char e = 'e';
		char f = 'f';
		char g = 'g';
		char h = 'h';
		char i = 'i';
		char j = 'j';
		char k = 'k';
		char l = 'l';
		char m = 'm';
		char n = 'n';
		char o = 'o';
		char p = 'p';
		char q = 'q';
		char r = 'r';
		char s = 's';
		char t = 't';
		char u = 'u';
		char v = 'v';
		char w = 'w';
		char x = 'x';
		char y = 'y';
		char z = 'z';
		
		
		int aValue = a;
		int bValue = b;
		int cValue = c;
		int dValue = d;
		int eValue = e;
		int fValue = f;
		int gValue = g;
		int hValue = h;
		int iValue = i;
		int jValue = j;
		int kValue = k;
		int lValue = l;
		int mValue = m;
		int nValue = n;
		int oValue = o;
		int pValue = p;
		int qValue = q;
		int rValue = r;
		int sValue = s;
		int tValue = t;
		int uValue = u;
		int vValue = v;
		int wValue = w;
		int xValue = x;
		int yValue = y;
		int zValue = z;
		
		ArrayList<Integer> asciiNumbers = new ArrayList<>(); 
		
		asciiNumbers.add(aValue);
		asciiNumbers.add(bValue);
		asciiNumbers.add(cValue);
		asciiNumbers.add(dValue);
		asciiNumbers.add(eValue);
		asciiNumbers.add(fValue);
		asciiNumbers.add(gValue);
		asciiNumbers.add(hValue);
		asciiNumbers.add(iValue);
		asciiNumbers.add(jValue);
		asciiNumbers.add(kValue);
		asciiNumbers.add(lValue);
		asciiNumbers.add(mValue);
		asciiNumbers.add(nValue);
		asciiNumbers.add(oValue);
		asciiNumbers.add(pValue);
		asciiNumbers.add(qValue);
		asciiNumbers.add(rValue);
		asciiNumbers.add(sValue);
		asciiNumbers.add(tValue);
		asciiNumbers.add(uValue);
		asciiNumbers.add(vValue);
		asciiNumbers.add(wValue);
		asciiNumbers.add(xValue);
		asciiNumbers.add(yValue);
		asciiNumbers.add(zValue);
		
		for(int num = 0; num < asciiNumbers.size(); num++) {
			int asciiNum = asciiNumbers.get(num);
			System.out.println(asciiNum);
			
		}
		
		ArrayList<String> asciiLetters = new ArrayList<>();
		
		asciiLetters.add(String.valueOf(a));
		asciiLetters.add(String.valueOf(b));
		asciiLetters.add(String.valueOf(c));
		asciiLetters.add(String.valueOf(d));
		asciiLetters.add(String.valueOf(e));
		asciiLetters.add(String.valueOf(f));
		asciiLetters.add(String.valueOf(g));
		asciiLetters.add(String.valueOf(h));
		asciiLetters.add(String.valueOf(i));
		asciiLetters.add(String.valueOf(j));
		asciiLetters.add(String.valueOf(k));
		asciiLetters.add(String.valueOf(l));
		asciiLetters.add(String.valueOf(m));
		asciiLetters.add(String.valueOf(n));
		asciiLetters.add(String.valueOf(o));
		asciiLetters.add(String.valueOf(p));
		asciiLetters.add(String.valueOf(q));
		asciiLetters.add(String.valueOf(r));
		asciiLetters.add(String.valueOf(s));
		asciiLetters.add(String.valueOf(t));
		asciiLetters.add(String.valueOf(u));
		asciiLetters.add(String.valueOf(v));
		asciiLetters.add(String.valueOf(w));
		asciiLetters.add(String.valueOf(x));
		asciiLetters.add(String.valueOf(y));
		asciiLetters.add(String.valueOf(z));
		
		for(int num2 = 0; num2 < asciiLetters.size(); num2++) {
			String asciiLower = asciiLetters.get(num2).toLowerCase();
			System.out.println(asciiLower);
			
		}
		
		for(int num3 = 0; num3 < asciiLetters.size(); num3++) {
			String asciiUpper = asciiLetters.get(num3).toUpperCase();
			System.out.println(asciiUpper);
		}

	}
	
	
	

}

package TRDZ.tasks;

import java.util.Arrays;

public class Initialization {

	public static void main(String[] args) {
		int[] massive = { 1, 2, 4, 4, 2, 3, 4, 1, 7 };
		System.out.print(Arrays.toString(massive));
		try	{ int[] result = delay_4(massive);
			System.out.println(" - "+Arrays.toString(result));
			}
		catch (RuntimeException e) {e.printStackTrace();
			System.out.println("\n"+e.getMessage());
			}
		int[] vec = { 1,1,1,4,4,1,4,4 };
		System.out.print(Arrays.toString(vec));
		if (check(vec)) {System.out.println(" содержит значения 1 и 4");}
		else System.out.println(" не содержит значения 1 и 4");
		}

	/**
	 * Получение части целочисленного массива после последнего элемента равного 4
	 * @param massive исходный массив
	 * @return необходимая часть массива
	 * @throws RuntimeException Нужного элемента не существует
	 */
	public static int[] delay_4(int[] massive) throws RuntimeException {
		if (massive.length>0 && massive[massive.length-1]==4) {
			int[] result = new int[0]; ;
			return result;
			}
		for ( int i=(massive.length-2); i>=0; i--) {
			if (massive[i]==4) {
				int[] result = new int[(massive.length-i-1)]; ;
				System.arraycopy(massive, (i+1), result, 0, result.length);
				return result;
				}
			}
		throw new RuntimeException("приведенный массив не содержит значения 4 для разбивки методом разбивки по 4");
		}

	/**
	 * Проверка массива на наличие элементов равных 1 и 4
	 * @param massive  исходный массив
	 * @return true / false
	 */
	public static boolean check(int[] massive) {
		int answer=0;
		for ( int i=(massive.length-2); i>=0; i--) {
			if (massive[i]==1) {
				if (answer%2!=1) answer+=1;
				}
			else if (massive[i]==4) {
				if (answer<2) answer+=2;
				}
			}
		return answer==3;
		}

	}

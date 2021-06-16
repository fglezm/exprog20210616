package fp.daw.exprog20210616.ejercicio4;

import java.util.*;

public class Ejercicio3 {

	public static void intercalar(Queue<Integer> q) {

		if (q.size() % 2 != 0)
			throw new IllegalArgumentException();

		Queue<Integer> p = new LinkedList<>();
		Queue<Integer> n = new LinkedList<>();

		int t = q.size();
		int r = t / 2;
		int s = r + 1;

		while (t-- > r)
			p.add(q.poll());
		System.out.println(p);
		while (r-- > 0)
			n.add(q.poll());
		System.out.println(n);

		while (!p.isEmpty()) {

			q.offer(p.poll());
			q.offer(n.poll());

		}

	}

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println(q);
		intercalar(q);
		System.out.println(q);

	}
}

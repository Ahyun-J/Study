package week05;

public class T <E>extends SList {

	public void a(int[] arr) {
		int index = 0;
		if (this.size() == 0) {
			this.insertFront(arr[index]);
			if (arr.length == 1)
				return;
			else
				index += 1;
		}

		if (this.size() == 1) {
			int head_num = (int) head.getItem();
			int this_num = arr[index];
			if (this_num <= head_num)
				this.insertFront(this_num);
			else
				this.insertAfter(this_num, head);
		}
		
		for (int ind = index+1; ind < arr.length; ind++) {
			Node cur = head;
			Node next = head.getNext();

			int insert_num = arr[ind];

			int cur_n = (int) cur.getItem();
			if (insert_num <= cur_n)
				this.insertFront(insert_num);
			else {
				while (true) {
					assert (cur != null);

					if (next == null) {
						this.insertAfter(insert_num, cur);
						break;
					}

					cur_n = (int) cur.getItem();
					int next_n = (int) next.getItem();

					assert (insert_num > cur_n);

					if (insert_num <= next_n && insert_num > cur_n) {
						this.insertAfter(insert_num, cur);
						break;
					} else {
						cur = cur.getNext();
						next = next.getNext();
					}

				}
			}
		}
	}
	
	public void join(SList slist2) {
		int l = (slist2.size() + this.size());
		int[] arr = new int[l];
		
		Node q = this.head;
		for (int i = 0; i < this.size(); i++) {
			arr[i] = (int) q.getItem();
			q = q.getNext();
		}
		
		Node p = slist2.head;
		for (int i = this.size(); i < l; i++) {
			arr[i] = (int) p.getItem();
			p = p.getNext();
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		this.a(arr);
	}
}

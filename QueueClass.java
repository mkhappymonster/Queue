package Queue;

public class QueueClass {
	int rear, front;
	int size = 5;
	int arr[] = new int[size];
	int lenght;

//	QueueClass() {
//		rear = (rear + 1) % size;
//		front = (front + 1) % size;
//		
//	}

	public void enQueue(int x) {
		if (isFull()) {
			System.out.println("Can't Push");
		} else {
			rear = (rear + 1) % size;
			arr[rear] = x;
			lenght++;
			System.out.println("Element added : " + x);
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Can't dequeue");
		} else {
			front = (front + 1) % size;
			--lenght;
		}
	}

	public Boolean isFull() {
		return lenght == size;
	}

	public Boolean isEmpty() {
		return lenght == 0;
	}

	int frontQueue() {
		System.out.println(arr[front]);
		return arr[front];
	}

	int rearQueue() {
		System.out.println(arr[rear]);
		return arr[rear];
	}
}

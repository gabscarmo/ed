public class HeapImpl<T extends Comparable<T>> {

	protected T[] heap;
	protected int index = -1;
	private static int ZERO = 0;
	/**
	 * O comparador é utilizado para fazer as comparações da heap. O ideal é
	 * mudar apenas o comparator e mandar reordenar a heap usando esse
	 * comparator. Assim os metodos da heap não precisam saber se vai funcionar
	 * como max-heap ou min-heap.
	 */
	protected Comparator<T> comparator;

	private static final int INITIAL_SIZE = 20;
	private static final int INCREASING_FACTOR = 10;

	public HeapImpl(Comparator<T> comparator) {
		this.heap = (T[]) (new Comparable[INITIAL_SIZE]);
		this.comparator = comparator;
	}

	private int parent(int i) {

		int x = (i - 1) / 2;
		return x;
	}

	/**
	 * Deve retornar o indice que representa o filho a esquerda do elemento
	 * indexado pela posição i no vetor
	 */
	private int left(int i) {
		return (i * 2 + 1);
	}

	/**
	 * Deve retornar o indice que representa o filho a direita do elemento
	 * indexado pela posição i no vetor
	 */
	private int right(int i) {
		return (i * 2 + 1) + 1;
	}

	public boolean isEmpty() {
		return (index == -1);
	}

	public T[] toArray() {
		T[] resp = Util.makeArrayOfComparable(index + 1);
		for (int i = 0; i <= index; i++) {
			resp[i] = this.heap[i];
		}
		return resp;
	}

	/**
	 * Valida o invariante de uma heap a partir de determinada posição, que pode
	 * ser a raiz da heap ou de uma sub-heap. O heapify deve colocar os maiores
	 * (comparados usando o comparator) elementos na parte de cima da heap.
	 */
	private void heapify(int position) {
		if (position == ZERO) { // Remove
			heapfyDown(ZERO);
		} else { // Insert
			heapfyUp(position);
		}
	}

	/**
	 * Faz o processo de Heapfy de cima para baixo, levando o elemento
	 * adicionado na raiz para aposição correta
	 */
	private void heapfyDown(int index) {
		int rightIndex = this.right(index);
		int leftIndex = this.left(index);
		int largest;

		if (leftIndex <= this.index && this.biggerElement(leftIndex, rightIndex) == leftIndex) {
			largest = leftIndex;
		} else {
			largest = index;
		}

		if (rightIndex <= this.index && this.biggerElement(rightIndex, largest) == rightIndex) {
			largest = rightIndex;
		}

		if (largest != index) {
			Util.swap(this.getHeap(), index, largest);
			this.heapfyDown(largest);
		}
	}

	/**
	 * Faz o processo de Heapfy de baixo para cima, levando o elemento
	 * adicionado para aposição correta
	 */
	private void heapfyUp(int position) {
		int currentIndex = position;

		while (this.biggerElement(currentIndex, this.parent(currentIndex)) == currentIndex
				&& this.parent(currentIndex) != currentIndex) {
			Util.swap(this.getHeap(), currentIndex, this.parent(currentIndex));
			currentIndex = this.parent(currentIndex);
		}

	}

	/**
	 * Verifica qual o maior elemento com base e seu indice e retorna o indice
	 * do mesmo
    */
	private int biggerElement(int IndexOfElem1, int IndexOfElem2) {
		if (this.comparator.compare(this.getHeap()[IndexOfElem1], this.getHeap()[IndexOfElem2]) > ZERO)
			return IndexOfElem1;
		else
			return IndexOfElem2;
	}

	public void insert(T element) {
		if (element != null) {

			if (index == heap.length - 1) {
				heap = Arrays.copyOf(heap, heap.length + INCREASING_FACTOR);
			}

			this.getHeap()[++this.index] = element;
			this.heapify(this.index);
		}
	}

	public void buildHeap(T[] array) {
		if (array != null & array.length > 0) {
			this.heap = (T[]) new Comparable[array.length];

			this.index = -1;

			for (int i = 0; i < array.length; i++) {
				if (array[i] != null)
					this.insert(array[i]);
			}

		}
	}
	
	public T extractRootElement() {
		T root = null;

		if (!this.isEmpty()) {
			root = this.getHeap()[ZERO];
			this.getHeap()[ZERO] = this.getHeap()[this.index];
			this.index--;
			this.heapify(ZERO);
		}

		return root;
	}

	public T rootElement() {
		T root = null;

		if (!this.isEmpty()) {
			root = this.getHeap()[ZERO];
		}

		return root;
	}

	@Override
	public T[] heapsort(T[] array) {
		Comparator<T> comparatorOriginal = this.comparator;

		this.setComparator((o1, o2) -> o1.compareTo(o2));
		this.buildHeap(array);

		T[] heapSorted = Util.makeArrayOfComparable(this.size());

		for (int i = this.index; i >= 0; i--) {
			heapSorted[i] = this.extractRootElement();
		}

		this.setComparator(comparatorOriginal);
		return heapSorted;

	}

	public int size() {
		return this.index + 1;
	}

	public Comparator<T> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	public T[] getHeap() {
		return heap;
	}
}


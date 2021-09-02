class Node {
  constructor(value) {
    this.value = value;
    this.prev = null;
    this.next = null;
  }
}

class SinglyLinkedList {
  constructor(value) {
    this.head = {
      value,
      next: null
    };

    this.tail = this.head;
    this.length = 1;
  }

  append(value) {
    const newNode = new Node(value);

    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;

    return this;
  }

  prepend(value) {
    const newNode = new Node(value);

    newNode.next = this.head;
    this.head = newNode;
    this.length++;

    return this;
  }

  insert(index, value) {
    if (index >= this.length) {
      return this.append(value);
    }

    const newNode = new Node(value);
    const firstPointer = this.getTheIndex(index - 1);
    const holdingPointer = firstPointer.next;
    firstPointer.next = newNode;
    newNode.next = holdingPointer;
    this.length++;
    return this;
  }

  getTheIndex(index) {
    let counter = 0;
    let currentNode = this.head;

    while (counter != index) {
      currentNode = currentNode.next;
      counter++;
    }

    return currentNode;
  }

  remove(index) {
    if (index >= this.length) {
      console.error('index is out of limits of the array');
    } else if (index == 0) {
      this.head = this.head.next;
      this.length--;
    } else if (index === this.length - 1) {
      const firstPointer = this.getTheIndex(index - 1);
      firstPointer.next = null;

      this.tail = firstPointer;
      this.length--;
    } else {
      const firstPointer = this.getTheIndex(index - 1);
      const pointerToRemove = firstPointer.next;
      firstPointer.next = pointerToRemove.next;
      this.length--;
    }
  }
}

class DoubleLinkedList {
  constructor(value) {
    this.head = {
      value: value,
      next: null,
      prev: null
    };

    this.tail = this.head;
    this.length = 1;
  }

  append(value) {
    const newNode = new Node(value);

    newNode.prev = this.tail;
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;

    return this;
  }

  prepend(value) {
    const newNode = new Node(value);

    this.head.prev = newNode;
    newNode.next = this.head;
    this.head = newNode;
    this.length++;

    return this;
  }

  insert(index, value) {
    if (index >= this.length) {
      return this.append(value);
    } else if (index === 0) {
      return this.prepend(value);
    }

    let newNode = new Node(value);
    let prevPointer = this.getTheIndex(index - 1);
    let nextPointer = prevPointer.next;
    newNode.prev = prevPointer;
    newNode.next = nextPointer;
    prevPointer.next = newNode;
    nextPointer.prev = newNode;
    this.length++;
    return this;
  }

  remove(index) {
    if (index >= this.length) {
      console.log('index fuera de rango');
      return;
    }
    let indexToRemove = this.getTheIndex(index);
    let nextPointer = indexToRemove.next;
    let prevPointer = indexToRemove.prev;
    if (prevPointer && nextPointer) {
      prevPointer.next = nextPointer;
      nextPointer.prev = prevPointer;
    } else if (!prevPointer) {
      nextPointer.prev = null;
      this.head = nextPointer;
    } else if (!nextPointer) {
      prevPointer.next = null;
      this.tail = prevPointer;
    }
    this.length--;
    return this;
  }

  getTheIndex(index) {
    let counter = 0;
    let currentNode = this.head;
    while (counter !== index) {
      currentNode = currentNode.next;
      counter++;
    }
    return currentNode;
  }
}

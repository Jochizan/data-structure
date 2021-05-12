const messyList = [13, 1, 2, 3, 11, 20, 9, 10, 1, -10, 14];

const swap = (arr, i, j) => {
  let aux = arr[i];
  arr[i] = arr[j];
  arr[j] = aux;
};

const sortAlgorithm = (arr) => {
  const sortArr = arr.reduce((acc, el, index) => {
    let tmp = index;

    for (let j = index + 1; j < arr.length; j++) {
      if (arr[j] < arr[tmp]) tmp = j;
    }

    swap(arr, tmp, index);
    console.log(acc, el);
    return [...arr];
  }, []);

  console.log(sortArr);
};

sortAlgorithm(messyList);

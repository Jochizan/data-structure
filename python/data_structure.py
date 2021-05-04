list = [1, 2, 3, 4, 5]
obj = {
    'firs_name': 'Joan',
    'last_name': 'Roca Hormaza'
}

print(list, obj)

messy_list = [13, 1, 2, 3, 11, 20, 9, 1, -10, 14]


def swap(arr, i, j):
    aux = arr[i]
    arr[i] = arr[j]
    arr[j] = aux


# algoritmo más eficiente que el bubble sort
def sort_algorithm(list):

    n = len(list)
    print(list)

    for i in range(0, n):

        tmp = i

        for j in range(i + 1, n):
            if list[j] < list[tmp]:
                tmp = j

        swap(list, tmp, i)
        # print(list)

    print(list)
    return list


sort_algorithm(messy_list)


def linearSearch(item, my_list):
    found = False
    position = 0

    while position < len(my_list) and not found:
        if my_list[position] == item:
            found = True

        position = position + 1

    return found


bag = ['book', 'pencil', 'pen', 'note book', 'sharpener', 'rubber']
item = input('¿Cúal es el item que quiere buscar?\nIngrese su nombre: ')
itemFound = linearSearch(item, bag)

if itemFound:
    print('Ese item se encuentra en su lista')
else:
    print('Oops, ese item NO se encuentra en su lista')

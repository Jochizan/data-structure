#include <iostream>
#include <stdlib.h>

using namespace std;

struct node {
	int data;
	struct node *next;
};

typedef struct _node {
	int data;
	struct _node *next;
} typeNode;

typedef typeNode *pNode;
typedef typeNode *List;

int isEmpty(List list) {
	return (list == NULL);
}

void seeList(List list) {
   pNode node = list;

   if(isEmpty(list)) printf("Lista vacia\n");
   else {
      while(node) {
      	//printf("%d", node);
        printf("%d -> ", node->data);
        node = node->next;
     }
     printf("\n");
   }
}

void insert(List *list, int v) {
	pNode newNode, beforeNode;
	
	newNode = (pNode)malloc(sizeof(typeNode));
	newNode->data = v;
	
	if (isEmpty(*list) || (*list)->data > v) {
		newNode->next = *list;
		
		*list = newNode;
	} else {
		beforeNode = *list;
		//seeList(beforeNode);
		while (beforeNode->next && beforeNode->next->data <= v) {
			beforeNode = beforeNode->next;
			newNode->next = beforeNode->next;
			beforeNode->next = newNode;
		}
	}
}

void deleteNode(List *list, int v) {
   pNode before, node;

   node = *list;
   before = NULL;
   while(node && node->data < v) {
      before = node;
      node = node->next;
   }
   if(!node || node->data != v) return;
   else { /* Borrar el nodo */
      if(!before) /* Primer elemento */
         *list = node->next;
      else  /* un elemento cualquiera */
         before->next = node->next;
      free(node);
   }
}

void deleteList(List *list) {
   pNode node;

   while(*list) {
      node = *list;
      *list = node->next;
      free(node);
   }
}

int main() {
	List list = NULL;
	
	insert(&list, 20);
	insert(&list, 19);
	insert(&list, 18);
	insert(&list, 17);
	insert(&list, 11);
	//insert(&list, 30);
	
	seeList(list);
	
	printf("\n");
	deleteList(&list);
	return 0;
}

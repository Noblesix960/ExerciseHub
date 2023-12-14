#include <stdlib.h>
#include <stdio.h>

// Definition for singly-linked list.
struct ListNode
{
    int val;
    struct ListNode *next;
};

void appendNode(struct ListNode *head, int val);
void printList(struct ListNode *head);
void addNodeAtIndex(struct ListNode *head, int index, int value);

int main(int argc, char const *argv[])
{

    // Testing an Empty Node
    struct ListNode *emptyNode = NULL;
    printList(emptyNode);

    // Testing a Single Node
    struct ListNode *singleNode;
    singleNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    singleNode->val = 1;
    singleNode->next = NULL;
    printList(singleNode);

    // Testing general list
    struct ListNode *node;
    node = (struct ListNode *)malloc(sizeof(struct ListNode));
    node->val = 2;
    node->next = singleNode;
    printList(node);

    appendNode(node, 0);
    appendNode(node, -1);
    printList(node);

    addNodeAtIndex(node, 2, 8);
    printList(node);

    return 0;
}

/*
    printList() that prints the whole list of nodes
*/
void printList(struct ListNode *head)
{
    // Base case
    if (head == NULL)
    {
        printf("Empty list\n");
        return;
    }

    // Initialize a pointer currentNode pointing to the head
    struct ListNode *currentNode = head;

    do
    {
        // In each iteration print the value of the current node,
        // then update the currentNode and move on to the next node
        printf("(%d)", currentNode->val);
        currentNode = currentNode->next;
        if (currentNode != NULL)
        {
            printf("->");
        }
    } while (currentNode != NULL);
    printf("\n");
}

/*
    appendNode() creates and append a new node to the list we got in input
*/
void appendNode(struct ListNode *head, int value)
{
    // Base case
    if (head == NULL)
    {
        printf("Empty list");
        return;
    }

    // Initialize a pointer "current" pointing to the head
    struct ListNode *current = head;

    // Update the pointer to the last node in the list
    while (current->next != NULL)
    {
        current = current->next;
    }

    // Create a new node to add at the end of the list
    struct ListNode *newNode;
    newNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    newNode->val = value;
    newNode->next = NULL;

    // Then we link the last node to the new one
    current->next = newNode;
}

/*
    addNodeAtIndex() Add a node next at index position of the list
*/
void addNodeAtIndex(struct ListNode *head, int index, int value)
{

    // Base case
    if (head == NULL)
    {
        printf("Empty list");
        return;
    }
    // Inizialize the counter at 1
    int count = 1;

    struct ListNode *currentNode = head;

    // Updates the pointer "currentNode" on "index - 1" position
    while (index < count)
    {
        currentNode = currentNode->next;
        count++;
    }

    struct ListNode *temp = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *newNode = (struct ListNode *)malloc(sizeof(struct ListNode));

    newNode->val = value;
    temp = currentNode->next;
    currentNode->next = newNode;
    newNode->next = temp;
}
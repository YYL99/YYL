#include<stdio.h>
#include<stdlib.h>
struct node
{
    int num;
    struct node *next;
};
void main()
{
    struct node*createLink();
    int m=0;
    struct node *head=createLink(),*temp,*p=head;
    while(p->next!=p)
    {
       m++;
        if(m==3)
        {
            m=0;
            temp->next=p->next;
        }
        temp=p;
        p=p->next;
    }
    printf("%d\n",p->num);
}
struct node*createLink()
{
    struct node*head=(struct node*)malloc(sizeof(struct node)),
           *p,*temp;
    int i=1;
    head->num=i++;
    temp=head;
    while(i<14)
    {
        p=(struct node*)malloc(sizeof(struct node));
        p->num=i++;
        temp->next=p;
        temp=p;
    }
    temp->next=head;
    return head;
};

/*
Definition of singly linked list:
class ListNode{
  public:
    int data;
    ListNode *next;
    ListNode() : data(0), next(nullptr) {}
    ListNode(int x) : data(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : data(x), next(next) {}
};
*/

class Solution {
    public:
        ListNode* insertAtKthPosition(ListNode* &head, int X, int K) {
           if(head==NULL){
            if(K==1){
                return new ListNode(X);
            }else{
                return head;
            }
           }
           if(K==1){
            return new ListNode(X,head);
           }
           int count=0;
           ListNode* temp=head;
           while(temp!=NULL){
            count++;
            if(count==K-1){
                ListNode* newNode=new ListNode(X,temp->next);
                temp->next=newNode;
                break;
            }
            temp=temp->next;
           }
           return head;
        }
};
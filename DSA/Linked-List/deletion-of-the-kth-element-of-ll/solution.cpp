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
        ListNode* deleteKthNode(ListNode* &head, int k) {
            if(head==NULL)return head;
            int count=0;
            ListNode* temp=head;
            ListNode* prev=NULL;
            if(k==1){
                head=head->next;
                return head;
            }
            while(temp!=NULL){
                count++;
                if(count==k){
                    prev->next=prev->next->next;
                    free(temp);
                    break;
                }
                prev=temp;
                temp=temp->next;
            }
            return head;
        }
};

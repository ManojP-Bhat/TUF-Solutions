class Solution {
public:
    int getLength(ListNode* head) {
        int count=0;
        while(head!=nullptr){
            count++;
            head=head->next;
        }
        return count;
    }
};
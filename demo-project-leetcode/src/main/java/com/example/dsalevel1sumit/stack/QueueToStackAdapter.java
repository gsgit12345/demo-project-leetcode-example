package com.example.dsalevel1sumit.stack;

public class QueueToStackAdapter {
    //https://www.youtube.com/watch?v=bJpPuLMiUgA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=194

    //this code provide big(1) solution for pop() and remove() solution
    // idea behind this approach that push will provide big(n) solution
    // we are storing element in queue like stack.IN stack element is store first in first manner
    //we will take two queue 1-main queue and helper queue.
    //while adding the in the queue ,first I will remove all element from the main queue and will add in helper queue
    //then after we will remove all element from the helper queue and add in the main queue
    //in this way we will store the element in fifo manner.
    //stack is lifo and queue is the fifo
}

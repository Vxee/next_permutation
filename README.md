# next_permutation
这是一个求下一个排列的算法。之前学习了求全排列的算法。然后参考了实现的代码。
先说一下具体的思想：下一个排列一定会和前面一个排列有尽可能多的相同的前缀，所以先从后向前找直到有当前的数大于前一个数（假如找不到则这是一个递减的序列），比如序列125643，6>5,因此下个序列的前缀也是12，所以就找5643的下个序列。明显5后面至少有一个数比他大，然后5就要从末尾向前找，找到一个比他大的和他交换顺序，变成6543，543也是个递减序列，要反转变成345，最终125643的下一个序列就是126345.

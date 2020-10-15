

class Node: 
    

    def __init__(self, item, left, right ):
        self.data = item
        self.left = left
        self.right = right



def lca(root, input1, input2):

    if root is None:
        return None

    left = lca(root.left, input1, input2)
    right = lca(root.right, input1, input2)

    if left is not None and right is not None:
        return root
    
    if left is not None:
        return left
    else:
        return right
    

def main():
    one =  Node(1, 2, 3)
    two =  Node(2,None,None)
    three = Node(3,None,None)

    answer = lca(one, 2,3)
    print(answer.data)






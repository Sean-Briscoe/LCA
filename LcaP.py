class Node: 
    

    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None



def lca(root, n1, n2):

    if root is None:
        return None

    if root == n1 or root == n2:
        return root

    left = lca(root.left, n1, n2)
    right = lca(root.right, n1, n2)

    if left is not None and right is not None:
        return root
    
    if left is not None:
        return left
    else:
        return right

    
root = Node(1)
root.left.left = Node(4)
root.left.right = Node(5)
print ("LCA(4,5) = ",lca(root, 4, 5).data)



#struct
class Node:
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right
 
 
#Checks if node is in tree
def nodePrescence(root, node):

    if root is None:
        return False
 
    if root == node:
        return True

    return nodePrescence(root.left, node) or nodePrescence(root.right, node)
 
 
def lcaPrescence(root, lca, x, y):
 
    #base case
    if root is None:
        return False, lca
 
    if root == x or root == y:
        return True, root
 
    #left side
    left, lca = lcaPrescence(root.left, lca, x, y)
    #right side
    right, lca = lcaPrescence(root.right, lca, x, y)
 
    #if x and y are found in left and right respectively update lca
    if left and right:
        lca = root
 
    #return if x or y is present
    return (left or right), lca
 
 
#lca function
def Lca(root, x, y):
 
    # lca current lca
    lca = None
 
    #x and y present? call lca
    if nodePrescence(root, y) and nodePrescence(root, x):
        lca = lcaPrescence(root, lca, x, y)[1]
 
    if lca:
        return lca.data
    else:
        print("LCA doesn't exist")

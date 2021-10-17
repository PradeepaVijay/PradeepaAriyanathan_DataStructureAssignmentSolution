package com.greatlearning.dsa.assignment.main;

import com.greatlearning.dsa.assignment.service.BSTToRightSkewedTree;
import com.greatlearning.dsa.assignment.service.Node;

public class Main {

	// Driver Code
	public static void main(String[] args) {

		BSTToRightSkewedTree.node = new Node(50);
		BSTToRightSkewedTree.node.left = new Node(30);
		BSTToRightSkewedTree.node.right = new Node(60);
		BSTToRightSkewedTree.node.left.left = new Node(10);
		BSTToRightSkewedTree.node.left.right = new Node(40);
		BSTToRightSkewedTree.flattenBSTToRightSkewed(BSTToRightSkewedTree.node);
		BSTToRightSkewedTree.traverseRightSkewed(BSTToRightSkewedTree.headNode);
	}
}

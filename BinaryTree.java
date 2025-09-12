//
// Árvore Binária - Exemplo de implementação em Java
// Copyright (C) 2023 André Kishimoto e Jean Marcos Laine (code changed in 2025)
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.
//

package EDII;

// imports para a fila que pode ser usada na levelOrderTraversalHelper(). 
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private BTNode root;

	public BinaryTree() {
		this(null);
	}

	public BinaryTree(BTNode root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int getDegree() {
		return getDegreeHelper(root);
	}

	private int getDegreeHelper(BTNode node) {
		//TODO
	}

	public int getHeight() {
		if (isEmpty()) {
			return -1;
		}

		return root.getHeight();
	}

	public String inOrderTraversal() {
		return inOrderTraversalHelper(root);
	}

	private String inOrderTraversalHelper(BTNode node) {
		//TODO
	}

	public String preOrderTraversal() {
		return preOrderTraversalHelper(root);
	}

	private String preOrderTraversalHelper(BTNode node) {
		//TODO
	}

	public String postOrderTraversal() {
		return postOrderTraversalHelper(root);
	}

	private String postOrderTraversalHelper(BTNode node) {
		if (node == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		
		sb.append(postOrderTraversalHelper(node.getLeft()));
		sb.append(postOrderTraversalHelper(node.getRight()));
		sb.append(node.getData() + " ");
		
		return sb.toString();
	}

	public String levelOrderTraversal() {
		return levelOrderTraversalHelper(root);
	}
	
	private String levelOrderTraversalHelper(BTNode node) {
		//TODO
	}

	@Override
	public String toString() {
		return "BinaryTree - isEmpty(): " + isEmpty()
				+ ", getDegree(): " + getDegree()
				+ ", getHeight(): " + getHeight()
				+ ", root => { " + root + " }";				
	}

}

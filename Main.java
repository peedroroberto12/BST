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



// Você deve criar a Árvore abaixo, explicitamente no código main:
//
//     A
//   /   \
//  B     C
//   \   /
//    D E
//       \
//        F
//       / \
//      G   H
//



import EDII.BTNode;
import EDII.BinaryTree;

public class Main {

	public static void main(String[] args) {
		// Primeiro nó a ser inserido na árvore.
		BTNode a = new BTNode("A");
		System.out.println(a);
		
		// Segundo nó a ser inserido na árvore.
		// Observe que ainda não há conexão entre A e B.
		BTNode b = new BTNode("B");
		System.out.println(b);
		
		// Aqui, definimos que o filho esquerdo de A é B...
		a.setLeft(b);
		
		// ...E, portanto, é necessário definir que A é pai de B.
		b.setParent(a);
		
		//
		// TODO: Continuar com a construção da árvore ****
		//
		
		System.out.println("--------------------");
		
		// Cria um objeto do tipo BinaryTree e define que a raiz da árvore binária é o nó A.
		BinaryTree tree = new BinaryTree(a); 
		
		// Saídas
		System.out.println(tree);
		System.out.println("Pré-ordem: " + tree.preOrderTraversal());
		System.out.println(" Em ordem: " + tree.inOrderTraversal());
		System.out.println("Pós-ordem: " + tree.postOrderTraversal());
		System.out.println("Por nível: " + tree.levelOrderTraversal());
		
		// Confira se a árvore foi construída como solicitado no exemplo e confira se os
		// métodos de percurso estão corretos.
	}

}

package main

import "fmt"

type Node struct {
	row int
	col int
	val int
}

func main()  {
	var chessMap [11][11]int
	chessMap[1][2] = 1
	chessMap[2][3] = 2

	var slice []Node

	for i,v := range chessMap {
		for j,v2 := range v {
			if v2 != 0 {
				node := Node{
					row: i,
					col: j,
					val: v2,
				}
				slice = append(slice,node)
			}
		}
	}

	for _,val := range slice {
		fmt.Printf("row=%v,col=%v,val=%v",val.row,val.col,val.val)
		fmt.Println()
	}

	//恢复原始数据
	var chessMap2[11][11]int
	for _,node := range slice {
		chessMap2[node.row][node.col] = node.val
	}

	for _,v := range chessMap2 {
		for _,v2 := range v {
			fmt.Printf("%v\t",v2)
		}
		fmt.Println()
	}

}
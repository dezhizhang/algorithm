package sparseArray

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

}
package singleLink

import "fmt"

// 定义一个节点

type HeroNode struct {
	no       int
	name     string
	nickname string
	next     *HeroNode
}

// 加入节点

func InsertHeroNode(head *HeroNode,newHeroNode *HeroNode)  {
	temp := head
	for {
		if temp.next == nil {
			break
		}
		temp = temp.next
	}
	temp.next= newHeroNode

}
// 显示所有节点

func  ListHeroNode(head *HeroNode)  {
	temp := head

	// 判断该链表是否是一个空链表
	if temp.next == nil {
		fmt.Println("空空如也")
		return
	}
	for {
		fmt.Printf("[%d,%s,%s]",temp.next.no,temp.next.name,temp.next.nickname)
		temp = temp.next

		if temp.next == nil {
			break
		}
	}
}
func main() {
	// 创建头节点
	head := &HeroNode{}

	hero1 := &HeroNode{
		no: 1,
		name: "宋江",
		nickname: "及时说",
	}
	hero2 := &HeroNode{
		no: 2,
		name: "卢俊义",
		nickname: "及时说",
	}

	InsertHeroNode(head,hero1)
	InsertHeroNode(head,hero2)
	ListHeroNode(head)
}
package queue

import (
	"errors"
	"fmt"
	"os"
)

type Queue struct {
	maxSize int
	array   [4]int
	front   int // 指向队列首位
	rear    int // 表示指向队列的尾部
}

//添加数据到队列中

func (this *Queue) AddQueue(val int) (err error) {
	if this.rear == this.maxSize-1 {
		return errors.New("队列以满")
	}
	this.rear++
	this.array[this.rear] = val
	return
}

// 队列中取数据

func (this *Queue) GetQueue()(val int,err error) {
	//先判断队列是否为空
	if this.rear == this.front {
		return -1,errors.New("队列为空")
	}
	this.front++
	val = this.array[this.front]
	return val,nil
}

// 显示数据

func (this *Queue) ShowQueue() {
	for i := this.front + 1; i <= this.rear; i++ {
		fmt.Printf("array[%d]=%d\t", i, this.array[i])
	}
}

func main() {

	queue := &Queue{
		maxSize: 5,
		front: -1,
		rear: -1,
	}

	var key string
	var val int

	for {
		fmt.Println("1.输入add表示添加数据到队列中")
		fmt.Println("2.输入get表示从队列中获取数据")
		fmt.Println("3.输入show表示显示队列")
		fmt.Println("4.输入exit表示退出")

		fmt.Scanln(&key)
		switch key {
		case "add":
			fmt.Println("输入你要入队列数")
			fmt.Scanln(&val)
			err := queue.AddQueue(val)
			if err != nil {
				fmt.Println(err.Error())
				return
			}
			fmt.Println("加入队列成功")
		case "get":
			value,err := queue.GetQueue()
			if err != nil {
				fmt.Println(err.Error())
				return
			}

			fmt.Printf("value=%v",value)
		case "show":
			queue.ShowQueue()
		case "exit":
			os.Exit(0)
		}
	}
}

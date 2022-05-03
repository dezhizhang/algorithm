package main

import (
	"errors"
	"fmt"
	"os"
)

type CircleQueue struct {
	maxSize int
	array   [4]int
	head    int // 指向队列队首
	tail    int // 指向队尾
}

// 判断环形队列是否为满

func (this *CircleQueue) IsFull() bool {
	return (this.tail+1)%this.maxSize == this.head
}

// 判断环形队列是否为空

func (this *CircleQueue) IsEmpty() bool {
	return this.tail == this.head
}

// 判断环形队列有多少个值

func (this *CircleQueue) Size() int {
	return (this.tail + this.maxSize - this.head) % this.maxSize
}

// 入队列

func (this *CircleQueue) Push(val int) error {
	if this.IsFull() {
		return errors.New("队列以满")
	}
	this.array[this.tail] = val
	this.tail = (this.tail + 1) % this.maxSize
	return nil
}

// 出队

func (this *CircleQueue) Pop() (val int, err error) {
	if this.IsEmpty() {
		return -1, errors.New("队列为空")
	}
	val = this.array[this.head]
	this.head = (this.head + 1) % this.maxSize
	return val, nil
}

// 显示队列

func (this *CircleQueue) Show() {
	size := this.Size()
	if this.IsEmpty() {
		fmt.Println("队列为空")
		return
	}

	tempHead := this.head
	for i := tempHead; i < size; i++ {
		fmt.Printf("array[%d]=%d\t", tempHead, this.array[tempHead])
		tempHead = (tempHead + 1) % this.maxSize
	}
}

func main() {

	queue := &CircleQueue{
		maxSize: 5,
		head:    0,
		tail:    0,
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
			err := queue.Push(val)
			if err != nil {
				fmt.Println(err.Error())
				break
			}
			fmt.Println("加入队列成功")
		case "get":
			value, err := queue.Pop()
			if err != nil {
				fmt.Println(err.Error())
				break
			}

			fmt.Printf("value=%v", value)
		case "show":
			queue.Show()
		case "exit":
			os.Exit(0)
		}
	}
}

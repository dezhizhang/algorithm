/*
 * :file description: 
 * :name: /algorithm/src/com/leetcode/intersection/index.js
 * :author: 张德志
 * :copyright: (c) 2024, Tungee
 * :date created: 2024-01-20 07:48:04
 * :last editor: 张德志
 * :date last edited: 2024-01-20 07:55:12
 */
var intersection = function(nums1, nums2) {
    const list = [];
  

    const obj = {};
    for(let i=0;i < nums2.length;i++) {
        obj[nums1[i]] = nums1[i]
    }

    for(let i=0;i < Object.values(obj).length;i++) {
        if(nums2.includes(nums1[i])) {
            list.push(nums1[i]);
        }
    }
    return list;
};

console.log(intersection([1,2,2,1],[2,2]))
# leetcode-practice
leetCode每日练习

# day1:Two Sum 
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  
  给定一个整数数组，返回两个数字的索引，使它们加起来等于一个特定的目标。
  您可以假设每个输入将只有一个解决方案，并且不能两次使用相同的元素。
  
  Example:
  Given nums = [2, 7, 11, 15], target = 9,
  Because nums[0] + nums[1] = 2 + 7 = 9,
  return [0, 1].
  
  解法1:直接遍历比较，时间复杂度O(n^2);空间复杂度O(1)
  
  解法2:使用HashMap，时间复杂度O(n),空间复杂度O(n)

# day2:
### 判定是否互为字符重排 CheckPermutation.java
  给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
  
  Example:
  输入: s1 = "abc", s2 = "bca",输出: true
  
  输入: s1 = "abc", s2 = "bad",输出: false
  
### 判定字符是否唯一 IsUnique.java
  实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
  
  Example:
  输入: s = "leetcode",
  输出: false 
  
  输入: s = "abc",
  输出: true
  
### URL化  ReplaceSpaces.java
  URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）

  Example:
  输入："Mr John Smith    ", 13;
  输出："Mr%20John%20Smith"
 
  输入："               ", 5;
  输出："%20%20%20%20%20"
	
# day3:

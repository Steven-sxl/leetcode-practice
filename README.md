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
### 一次编辑
  字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。

  输入: 
  first = "pale"
  second = "ple"
  输出: True
  
  输入: 
  first = "pales"
  second = "pal"
  输出: False

### 回文排列
  给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
  回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
  回文串不一定是字典当中的单词。
  
  输入："tactcoa"
 输出：true（排列有"tacocat"、"atcocta"，等等）
  
# day4:
### 字符串压缩
  字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
  
  输入："aabcccccaaa";输出："a2b1c5a3"
  
  输入："abbccd";
  输出："abbccd";
  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。


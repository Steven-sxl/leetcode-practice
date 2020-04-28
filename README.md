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

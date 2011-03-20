module BrisFunctional.ProblemTests where

import BrisFunctional.Problem1
import BrisFunctional.Problem2
import BrisFunctional.Problem3

import Test.HUnit

main = runTestTT $ TestList
  [ testProblem1
  , testProblem2
  , testProblem3 ]


module BrisFunctional.ProblemTests where

import BrisFunctional.Problem1
import BrisFunctional.Problem2
import BrisFunctional.Problem3
import BrisFunctional.Problem4
import BrisFunctional.Problem5

import Test.HUnit

main = runTestTT $ TestList
  [ testProblem1
  , testProblem2
  , testProblem3
  , testProblem4
  , testProblem5 ]


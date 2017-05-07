package com.unhappychoice.norimaki.domain.model

import android.graphics.Color
import com.github.unhappychoice.circleci.response.Build

fun Build.repositoryString(): String = "$username / $reponame"
fun Build.revisionString(): String = "$branch (${vcsRevision?.take(6)})"

fun Build.statusColor(): Int = when (status) {
  "success", "fixed", "no_tests" -> Color.rgb(66, 200, 138)
  "canceled" -> Color.rgb(137, 137, 137)
  "infrastructure_fail", "timedout", "failed" -> Color.rgb(237, 92, 92)
  else -> Color.rgb(92, 211, 228)
}
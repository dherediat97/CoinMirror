package com.nextlevel.coinmirror.feature.symbolHistory

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.EaseInOutCubic
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nextlevel.coinmirror.components.CoinMirrorTopBar
import ir.ehsannarmani.compose_charts.LineChart
import ir.ehsannarmani.compose_charts.models.AnimationMode
import ir.ehsannarmani.compose_charts.models.DrawStyle
import ir.ehsannarmani.compose_charts.models.Line

@Composable
fun SymbolDetailScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CoinMirrorTopBar() },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxSize(0.5f)
                .animateContentSize(),
        ) {
            LineChart(
                modifier = Modifier
                    .fillMaxWidth()
                    .animateContentSize(),
                data = listOf(
                    Line(
                        label = "Bitcoin",
                        values = listOf(16000.0, 20000.0, 22000.0, 21000.0, 26000.0),
                        color = SolidColor(MaterialTheme.colorScheme.primary),
                        firstGradientFillColor = MaterialTheme.colorScheme.primary.copy(alpha = .2f),
                        secondGradientFillColor = Color.Transparent,
                        strokeAnimationSpec = tween(2000, easing = EaseInOutCubic),
                        gradientAnimationDelay = 1000,
                        drawStyle = DrawStyle.Stroke(width = 2.dp),
                    ),
                    Line(
                        label = "Ethereum",
                        values = listOf(10000.0, 14000.0, 16000.0, 12000.0, 9000.0),
                        color = SolidColor(MaterialTheme.colorScheme.secondary),
                        firstGradientFillColor = MaterialTheme.colorScheme.secondary.copy(alpha = .5f),
                        secondGradientFillColor = Color.Transparent,
                        strokeAnimationSpec = tween(2000, easing = EaseInOutCubic),
                        gradientAnimationDelay = 1000,
                        drawStyle = DrawStyle.Stroke(width = 2.dp),
                    )
                ),
                animationMode = AnimationMode.OneByOne,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SymbolDetailScreenPreview() {
    SymbolDetailScreen()
}
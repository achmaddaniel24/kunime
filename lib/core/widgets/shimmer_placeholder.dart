import 'package:flutter/material.dart';
import 'package:kunime/core/themes/app_tokens.dart';
import 'package:shimmer_animation/shimmer_animation.dart';

class ShimmerPlaceholder extends StatelessWidget {
  const ShimmerPlaceholder({super.key, required this.child});

  final Widget child;

  @override
  Widget build(BuildContext context) {
    return RepaintBoundary(
      child: Shimmer(
        duration: const Duration(milliseconds: 1400),
        interval: const Duration(milliseconds: 800),
        color: AppTokens.onSecondary,
        colorOpacity: 0.12,
        child: child,
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:kunime/core/themes/app_tokens.dart';
import 'package:kunime/core/widgets/shimmer_placeholder.dart';

class BannerSkeleton extends StatelessWidget {
  const BannerSkeleton({super.key});

  @override
  Widget build(BuildContext context) {
    return const ShimmerPlaceholder(
      child: ColoredBox(color: AppTokens.secondary),
    );
  }
}

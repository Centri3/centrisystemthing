DwarfMoon	"Bors I/Lercurnis B VII B-I"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.0001
	Radius          321.57
	InertiaMoment   0.3975
	Obliquity       1
	EqAscendNode    -178.63
	TidalLocked     true
    Age             0.0023

	Albedo          0.9
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_i.cfg"
		SurfStyle       0.14405
		Randomize      (-0.379, -0.361, -0.594)
		colorDistMagn   0.05123
		colorDistFreq   46.966
		detailScale     128
		drivenDarkening 0.25191
		seaLevel        -0.10687
		snowLevel       2
		tropicLatitude  0.017452
		icecapLatitude  0.8
		icecapHeight    0
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38983
		heightTempGrad  0.625
		beachWidth      0.00092255
		tropicWidth     0.07
		mainFreq        0.68702
		venusFreq       1.0076
		venusMagn       0.53435
		mareFreq        0.5
		mareDensity     0
		terraceProb     0.43412
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.029348
		dunesFreq       2.4066
		dunesFraction   0.44256
		hillsMagn       0.3
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      57.388
		riversFreq      3.2941
		riversSin       7.5028
		riftsMagn       16.794
		riftsFreq       1.8394
		riftsSin        6.0988
		eqridgeMagn     0.30534
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.3664
		canyonsMagn     0.46009
		canyonsFreq     0.10119
		canyonsFraction 0.33317
		cracksMagn      0.057556
		cracksFreq      0.093928
		cracksOctaves   0
		craterMagn      0.4
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.48092
		volcanoMagn     0
		volcanoFreq     1.3588
		volcanoDensity  0.076336
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.38168
		volcanoTemp     2106.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.079
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.55830576
		SemiMajorAxisKm 1391609.21
		Eccentricity    0.1
		Inclination     1
		AscendingNode   -178.625954
		ArgOfPericenter 228.091603
		MeanAnomaly     0
	}
}


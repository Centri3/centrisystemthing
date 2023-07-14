Moon	"Flora/Externia III"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Aquaria"
	Mass            0.016487
	Radius          2005.9
	InertiaMoment   0.36937
	RotationPeriod  4496.4
	RotationEpoch   0
	Obliquity       -5
	EqAscendNode    8.2443

	Albedo          0.66
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Exotic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "externia_flora.cfg"
		SurfStyle       0.37445
		Randomize      (-0.180, 0.723, -0.929)
		colorDistMagn   0.06611
		colorDistFreq   228.6
		detailScale     128
		drivenDarkening 0
		seaLevel        0.23665
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   0.45038
		climateEquator  0.58015
		climateSteppeMin 0.75573
		climateSteppeMax 1
		climateForestMin 0.83206
		climateForestMax 1
		climateGrassMin  0.74046
		climateGrassMax  1
		humidity        0.51145
		heightTempGrad  0.70229
		beachWidth      0.0013116
		tropicWidth     0.5
		mainFreq        1.0305
		venusFreq       0.076336
		venusMagn       1.4351
		mareFreq        0.60068
		mareDensity     0.15276
		terraceProb     0.30321
		erosion         0.11869
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      5
		riversFreq      7
		riversSin       7
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      1
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.4
		volcanoFreq     2
		volcanoDensity  0.33588
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39695
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     2.1041
		cycloneFreq     0.84078
		cycloneDensity  0.3065
		cycloneOctaves  3
		BumpHeight      6
		BumpOffset      1.4199
		DiffMapAlpha   "Water"
		SpecBrightWater 0.74809
		SpecBrightIce   0.1
		RoughnessWater  0.38168
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.22901
		RoughnessScale  1.1908
		Hapke           0.5
		SpotBright      1.3332
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           1.4199
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			He        	100
		}
	}

	Clouds
	{
		Height          3.6079
		Velocity        100
		BumpHeight      0.40803
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.801 0.921 1.000)
		ModulateBright  1
		Opacity         0.42748
		mainFreq        3
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          3.6079
		Velocity        110
		BumpHeight      0.50384
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateColor  (0.910 0.688 1.000)
		ModulateBright  1
		Opacity         0.10687
		mainFreq        3
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          3.6079
		Velocity        120
		BumpHeight      0.40803
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateColor  (1.000 0.844 0.844)
		ModulateBright  1
		Opacity         0.15267
		mainFreq        3
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia Flora"
		Height          20
		Density         7.3052
		Pressure        35
		Greenhouse      0.001
		Bright          5
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			He        	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      580.030354
		SemiMajorAxisKm 37696007
		Eccentricity    0.001
		Inclination     0.003
		AscendingNode   2.7480916
		ArgOfPericenter 79.6946565
		MeanAnomaly     0
	}
}


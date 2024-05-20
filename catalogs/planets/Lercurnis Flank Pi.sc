Moon	"Pi/Lercurnis III VI"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            3.87e-05
	Radius          250
	InertiaMoment   0.397
	Oblateness     (0.220, 0.275, 0.000)
	OblatenessInfo  0
	Obliquity       2
	EqAscendNode    -96.2
	TidalLocked     true

	EndogenousHeating 1.38
	Albedo          0.4
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_pi.cfg"
		SurfStyle       0.299
		Randomize      (-0.913, 0.684, -0.476)
		colorDistMagn   0.676
		colorDistFreq   42.7
		detailScale     256
		drivenDarkening 0
		seaLevel        0.649
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.827
		icecapHeight    0.104
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1
		heightTempGrad  0.625
		beachWidth      0.000491
		tropicWidth     0.07
		mainFreq        2.21
		venusFreq       0.992
		venusMagn       0.344
		terraceProb     0.181
		erosion         0
		montesMagn      0.3
		montesFreq      4
		montesSpiky     1
		montesFraction  1
		dunesMagn       8.55
		dunesFreq       8.09e+04
		dunesFraction   0
		hillsMagn       1
		hillsFreq       3
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     0.511
		eqridgeWidth    0.135
		eqridgeModMagn  0.763
		eqridgeModFreq  1.37
		canyonsFraction 0
		craterMagn      0.2
		craterFreq      2
		craterDensity   0.776
		craterOctaves   30
		craterRayedFactor 0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514
		volcanoTemp     231
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      71.6
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

	Atmosphere
	{
		Model          "Lercurnis Verna Wawa"
		Height          195
		Density         3.93
		Pressure        1e-07
		Bright          0.1
		Opacity         0
		SkyLight        1.83
		Hue             0.294
		Saturation      0.55

		Composition
		{
			Ar        	100
			O2        	0.0000894
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      16.5088126
		SemiMajorAxisKm 548212.728
		Eccentricity    0.001
		Inclination     2
		AscendingNode   -96.1832061
		ArgOfPericenter -107.175573
		MeanAnomaly     184.122137
	}
}

